package com.aws.codestar.projecttemplates.guice;

import com.cerner.beadledom.resteasy.ResteasyContextListener;
import com.google.inject.Module;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletContext;

public class EmojiServiceContextListener extends ResteasyContextListener {

  @Override
  protected List<? extends Module> getModules(ServletContext context) {
    return Arrays.asList(new GroupModule(), new ResteasyBootstrapModule());
  }
}
