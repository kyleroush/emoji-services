package com.aws.codestar.projecttemplates.group;

import com.cerner.beadledom.jaxrs.GenericResponse;
import com.cerner.beadledom.jaxrs.GenericResponses;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Api(value = "/groups")
@Path("/groups")
public class GroupResource {

  @ApiOperation(
      value = "Retrieves hello world data.",
      response = GroupDto.class)
  @ApiResponse(code = 200, message = "Success")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  GenericResponse<GroupDto> getList() {
    return GenericResponses.ok(GroupDto.builder().build()).build();
  }
}
