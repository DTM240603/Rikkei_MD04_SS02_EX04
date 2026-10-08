package ra.edu.hw.microservice.ss02.ex04.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.edu.hw.microservice.ss02.ex04.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
