package ra.edu.hw.microservice.ss02.ex04.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ra.edu.hw.microservice.ss02.ex04.entity.Order;
import ra.edu.hw.microservice.ss02.ex04.exception.ResourceNotFoundException;
import ra.edu.hw.microservice.ss02.ex04.repository.OrderRepository;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        String.format("Order với ID %d không tồn tại trên hệ thống!", id)
                ));
    }
}