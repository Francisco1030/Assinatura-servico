package model;

import java.time.LocalDate;
import java.time.Period;

public class Assinatura extends Produto implements Expiravel{

    private LocalDate dataExpiracao;

    @Override
    public String toString() {
        return "Código: " + getCodigo() + "\n Descrição: " + getDescricao()
                + "\n Preço: " + getPreco() + "\n Data de expiração: " + getDataExpiracao();
    }

    @Override
    public Period calculaPeriodoAteExpiracao() {
        return Period.between(dataExpiracao, LocalDate.now());
    }

    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(LocalDate dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }
}
