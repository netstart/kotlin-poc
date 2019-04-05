package ifood.company.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Company(
    @Id val id: Long,
    val responsibleName: String,
    val position: String,
    val phone: String,
    val email: String,
    val companyName: String,
    val segment: Segment,
    val employerTotal: EmployerTotal? = null
)

enum class Segment {
    CONTABILIDADE,
    ARMARINHOS,
    LAVANDERIA,
    CINEMA,
    RESTAURANTE;
}

enum class EmployerTotal(val value: Int) {
    FIVE(5),
    TEM(10),
    FIFTY(50)
}
