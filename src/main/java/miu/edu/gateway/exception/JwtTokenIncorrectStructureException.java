package miu.edu.gateway.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.extern.slf4j.Slf4j;

import java.io.Serial;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
@Slf4j
public class JwtTokenIncorrectStructureException extends RuntimeException
{
    @Serial
    private static final long serialVersionUID = 1L;

    public JwtTokenIncorrectStructureException(String message) {
        super(message);
        log.error(this.getClass().getName() + ": " + message);
    }
}