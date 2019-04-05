package ifood.company.repository

import ifood.company.entity.Company
import org.springframework.data.repository.CrudRepository

interface CompanyRepository : CrudRepository<Company, Long>