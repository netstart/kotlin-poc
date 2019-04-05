package ifood.company.controller.dto

import ifood.company.entity.Company
import ifood.company.entity.EmployerTotal
import ifood.company.entity.Segment
import java.time.LocalDateTime

data class CompanyDTO(
    val responsibleName: String,
    val position: String,
    val phone: String,
    val email: String,
    val companyName: String,
    val segment: String,
    val employerTotal: String
) {

    fun toCompany(): Company {
        return Company(
            1,
            this.responsibleName,
            this.position,
            this.phone,
            this.email,
            this.companyName,
            Segment.valueOf(this.segment),
            EmployerTotal.valueOf(this.employerTotal)
        )
    }
}