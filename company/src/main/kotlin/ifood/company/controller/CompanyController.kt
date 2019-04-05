package ifood.company.controller

import ifood.company.controller.dto.CompanyDTO
import ifood.company.service.CompanyService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/company")
class CompanyController(
    private val companyService: CompanyService
) {

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping
    fun save(@RequestBody companyDTO: CompanyDTO) {
        companyService.saveCompany(companyDTO.toCompany())
    }
}