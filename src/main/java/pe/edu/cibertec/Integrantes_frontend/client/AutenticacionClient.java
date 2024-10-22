package pe.edu.cibertec.Integrantes_frontend.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.edu.cibertec.Integrantes_frontend.config.AutenticacionFeingConfig;
import pe.edu.cibertec.Integrantes_frontend.dto.*;

import java.util.List;

@FeignClient(name = "autenticacion", url = "http://localhost:8081/autenticacion", configuration = AutenticacionFeingConfig.class)
public interface AutenticacionClient {



    @PostMapping("/login")
    ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO loginRequestDTO);

    @GetMapping("/get-integrantes")
    ResponseEntity<List<IntegrantesResponseDTO>> listarIntegrantes();



}
