package ru.ufs.mas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ufs.mas.domain.Properties;
import java.util.List;
import java.util.Optional;

@Repository
public interface PropertiesRepository extends JpaRepository<Properties, Long>  {

    public List<Properties> findByApplication(String application);

    public List<Properties> findByApplicationAndProfile(String application, String profile);

    public List<Properties> findByApplicationAndProfileAndLabel(String application, String profile, String label);

    public List<Properties> findByApplicationAndProfileAndLabelAndKey(String application, String profile,
                                                                      String label, String key);

    public Optional<Properties> findOneByApplicationAndProfileAndLabelAndKey(String application, String profile,
                                                                             String label, String key);

}
