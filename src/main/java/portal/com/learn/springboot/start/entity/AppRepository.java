package portal.com.learn.springboot.start.entity;

import org.springframework.data.repository.CrudRepository;

public interface AppRepository extends CrudRepository<App,Long> {
    App findByAppkey(String appkey);
}
