package ifood.company.controller.dto

import ifood.company.entity.Company
import ifood.company.entity.EmployerTotal
import ifood.company.entity.Segment

data class CompanyDTO(
        val id: Long?,
        val responsibleName: String?,
        val position: String?,
        val phone: String?,
        val email: String?,
        val companyName: String?,
        val segment: String?,
        val employerTotal: String?
) {

    fun toCompany(): Company {
        return Company(
            this.id,
            this.responsibleName!!,
            this.position!!,
            this.phone!!,
            this.email!!,
            this.companyName!!,
            Segment.valueOf(this.segment!!),
            EmployerTotal.valueOf(this.employerTotal!!)
        )
    }

}