package com.ctrip.apollo.configservice;

import com.ctrip.apollo.ConfigServiceApplication;

import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ConfigServiceApplication.class)
public abstract class AbstractConfigServiceTest {

}
