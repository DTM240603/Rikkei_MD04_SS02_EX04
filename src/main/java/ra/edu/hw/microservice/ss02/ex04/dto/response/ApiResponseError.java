package ra.edu.hw.microservice.ss02.ex04.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResponseError {
    private LocalDateTime timestamp;

    private int status;

    private String error;

    private String message;
}