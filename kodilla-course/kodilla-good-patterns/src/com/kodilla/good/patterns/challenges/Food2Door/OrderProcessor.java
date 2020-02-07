package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isSold = orderService.order(orderRequest.getSupplier(),orderRequest.getProduct());
        if (isSold) {
            informationService.confirm(orderRequest.getSupplier());
            orderRepository.createOrder(orderRequest.getSupplier(),orderRequest.getProduct());
            return new OrderDto(orderRequest.getSupplier(), true);
        }else{
            return new OrderDto(orderRequest.getSupplier(),false);
        }
    }
}
