package com.cryptoverse.model;

import com.cryptoverse.domain.VERIFICATION_TYPE;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class TwoFactorAuth {
    private boolean isEnabled = false;
    private VERIFICATION_TYPE sendTo;
}
