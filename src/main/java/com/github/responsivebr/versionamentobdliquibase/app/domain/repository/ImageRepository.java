package com.github.responsivebr.versionamentobdliquibase.app.domain.repository;

import com.github.responsivebr.versionamentobdliquibase.app.domain.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {

}
