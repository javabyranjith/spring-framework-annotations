package jbr.spring.anno.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({ "manager", "president" })
public class ReadAndWriteService implements AccessService {

  @Override
  public String level() {
    return "Read and Write";
  }

}
