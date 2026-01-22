package com.invoice.repositorie;

import com.invoice.models.RefreshToken;
import com.invoice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, String> {
    @Transactional
    Optional<RefreshToken> deleteRefreshTokenByUser(User user);
}
