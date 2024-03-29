/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.10).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.People;
import io.swagger.model.Person;
import io.swagger.model.PersonData;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-21T05:01:38.936Z")

@Api(value = "people", description = "the people API")
public interface PeopleApi {

    @ApiOperation(value = "Add a person to the database", nickname = "peopleAdd", notes = "", response = Person.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Added", response = Person.class) })
    @RequestMapping(value = "/people",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Person> peopleAdd(@ApiParam(value = "" ,required=true )  @Valid @RequestBody PersonData person);


    @ApiOperation(value = "Get a list of all people", nickname = "peopleList", notes = "", response = People.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = People.class) })
    @RequestMapping(value = "/people",
        produces = { "application/json", "text/html" }, 
        method = RequestMethod.GET)
    ResponseEntity<People> peopleList();


    @ApiOperation(value = "Delete this person", nickname = "personDelete", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/people/{uuid}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> personDelete(@ApiParam(value = "",required=true) @PathVariable("uuid") String uuid);


    @ApiOperation(value = "Get information about one person", nickname = "personGet", notes = "", response = Person.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Person.class),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/people/{uuid}",
        produces = { "application/json", "text/html" }, 
        method = RequestMethod.GET)
    ResponseEntity<Person> personGet(@ApiParam(value = "",required=true) @PathVariable("uuid") String uuid);


    @ApiOperation(value = "Update information about one person", nickname = "personUpdate", notes = "", response = Person.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated", response = Person.class),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/people/{uuid}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Person> personUpdate(@ApiParam(value = "",required=true) @PathVariable("uuid") String uuid,@ApiParam(value = "" ,required=true )  @Valid @RequestBody PersonData person);

}
