package miu.edu.gateway.models;

import java.io.Serial;
import java.io.Serializable;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = -2291091333924046844L;
    private String jwtToken;
}