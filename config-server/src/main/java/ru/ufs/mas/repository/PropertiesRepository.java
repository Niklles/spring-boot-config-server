package ru.ufs.mas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ufs.mas.domain.Properties;
import java.util.List;
import java.util.Optional;

@Repository
public interface PropertiesRepository extends JpaRepository<Properties, Long>  {

    List<Properties> findByApplication(String application);

    List<Properties> findByApplicationAndProfile(String application, String profile);

    List<Properties> findByApplicationAndProfileAndLabel(String application, String profile, String label);

    List<Properties> findByApplicationAndProfileAndLabelAndKey(String application, String profile,
                                                               String label, String key);

    Optional<Properties> findOneByApplicationAndProfileAndLabelAndKey(String application, String profile,
                                                                             String label, String key);

}
