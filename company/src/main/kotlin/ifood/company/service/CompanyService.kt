package ifood.company.service

import ifood.company.entity.Company
import ifood.company.repository.CompanyRepository
import org.springframework.stereotype.Service

@Service
class CompanyService(
    private var companyRepository: CompanyRepository
) {

    fun saveCompany(company: Company) {

        companyRepository.save(company)
    }
}
