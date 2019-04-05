package ifood.company.controller

import ifood.company.controller.dto.CompanyDTO
import ifood.company.service.CompanyService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class CompanyController(
    private val companyService: CompanyService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun save(companyDTO: CompanyDTO) {
        companyService.saveCompany(companyDTO.toCompany())
    }
}