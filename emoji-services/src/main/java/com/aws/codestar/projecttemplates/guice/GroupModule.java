package com.aws.codestar.projecttemplates.guice;

import com.aws.codestar.projecttemplates.group.GroupResource;
import com.google.inject.PrivateModule;

public class GroupModule  extends PrivateModule {
  protected void configure() {
    bind(GroupResource.class);
    expose(GroupResource.class);
  }
}
