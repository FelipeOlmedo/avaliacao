class Obra(var nome: String){
    private val insumosConsumido = arrayListOf<InsumoConsumido>()
    private val MaoDeObraUsada = arrayListOf<MaoDeObraUsada>()
    private val trabalhoDoEquipamento = arrayListOf<TrabalhoDoEquipamento>()

    fun temInsumo(insumoConsumido: InsumoConsumido){
        this.insumosConsumido.add(insumoConsumido)
    }

    fun temTrabalhadores(trabalhador: MaoDeObraUsada){
        this.MaoDeObraUsada.add(trabalhador)
    }

    fun usouEquipamento(equipamento: TrabalhoDoEquipamento){
        this.trabalhoDoEquipamento.add(equipamento)
    }

    fun gastosTotaisComInsumos(): Int{
        var valorTotal: Int = 0
        for (insumo in insumosConsumido){
            valorTotal += insumo.insumo.valor * insumo.quantidade
        }
        return valorTotal
    }

    fun gastosTotaisComMaoDeObra(): Int{
        var valorTotal: Int = 0
        for (trabalhador in MaoDeObraUsada){
            valorTotal += trabalhador.maodeobra.precoPorHora * trabalhador.horasTrabalhadas
        }
        return valorTotal
    }

    fun gastosTotaisComEquipamento(): Int{
        var valorTotal: Int = 0
        for (equipamento in trabalhoDoEquipamento){
            valorTotal += equipamento.horas * equipamento.equipamento.custo
        }
        return valorTotal
    }

    fun gastosTotaisObra(): Int{
        return gastosTotaisComInsumos() + gastosTotaisComMaoDeObra() + gastosTotaisComEquipamento()
    }
}