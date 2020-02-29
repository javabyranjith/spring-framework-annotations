package profile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jbr.spring.profile.AccessService;

@ActiveProfiles("learner")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:context-anno-beans.xml" })
public class ProfileAnnoTest {

  @Autowired
  private AccessService accessService;

  @Test
  public void test() {
    System.out.println(accessService.level());
  }
}
