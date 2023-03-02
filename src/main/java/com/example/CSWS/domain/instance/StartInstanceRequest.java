package com.example.CSWS.domain.instance;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StartInstanceRequest {
    private String instanceId;
}
