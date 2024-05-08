package izo.wtamamagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditDTO {

    private int id_credit;
    private String credit;
    private String credit_now;
    private String credit_total;
}
