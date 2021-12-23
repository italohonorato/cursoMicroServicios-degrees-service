package cl.teamweichafe.controllers;

import cl.teamweichafe.domain.Degree;
import cl.teamweichafe.services.DegreeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/degrees")
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Request Succeeded",
                content = { @Content(mediaType = "application/json",
                        schema = @Schema(implementation = Degree.class)) }),
        @ApiResponse(responseCode = "201", description = "Resource Created",
                content = { @Content(mediaType = "application/json",
                        schema = @Schema(implementation = Degree.class)) }),
        @ApiResponse(responseCode = "400", description = "Bad Request",
                content = @Content),
        @ApiResponse(responseCode = "404", description = "Not Found",
                content = @Content) ,
        @ApiResponse(responseCode = "500", description = "Internal Server Error",
                content = @Content)})
public class DegreeController {

    private final DegreeService degreeService;

    public DegreeController(DegreeService levelService) {
        this.degreeService = levelService;
    }

    @Operation(summary = "Endpoint to retrieve all Degrees")
    @GetMapping
    public ResponseEntity<List<Degree>> getAll() {

        return ResponseEntity.ok(this.degreeService.getAll());
    }

    @Operation(summary = "Endpoint to retrieve a Degree by Id")
    @GetMapping("/{id}")
    public ResponseEntity<Degree> getById(@PathVariable String id ) {

        return ResponseEntity.ok(this.degreeService.get(id));
    }

    @Operation(summary = "Endpoint to add a new Degree")
    @PostMapping
    public ResponseEntity<Degree> create(@RequestBody Degree degree) {
        return ResponseEntity.ok(degreeService.save(degree));
    }

    @Operation(summary = "Endpoint to update a Degree")
    @PutMapping("/{id}")
    public ResponseEntity<Degree> update(@PathVariable String id, @RequestBody Degree degree) {
        return ResponseEntity.ok(degreeService.get(id));
    }

    @Operation(summary = "Endpoint to delete a Degree")
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        degreeService.delete(id);
        return ResponseEntity.ok().build();
    }
}
