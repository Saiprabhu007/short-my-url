package com.devmadhurendra.backend.repository;

import com.devmadhurendra.backend.entity.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends JpaRepository<Url,Long> {
    Url findByShortUrl(String shortUrl);
}
