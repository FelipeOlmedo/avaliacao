fun main(args: Array<String>){
    //Instância Obra
    var obraContrucao = Obra("Construção")

    //Instância Locações
    var betoneira = Equipamento("Betoneira",28)
    var trator = Equipamento("Trator",17)
    var pa = Equipamento("Pá",3)

    var trabalhoBetoneira = TrabalhoDoEquipamento(betoneira,14)
    var trabalhoTrator = TrabalhoDoEquipamento(trator,6)
    var trabalhoPa = TrabalhoDoEquipamento(pa,3)

    //Instâncias Insumos
    var areia = Insumo("Areia",35)
    var cimento = Insumo("Cimento",55)
    var cal = Insumo("Cal",28)

    //Instância insumos consumidos
    var consumoAreia = InsumoConsumido(areia,22)
    var consumoCimento = InsumoConsumido(cimento,13)
    var consumoCal = InsumoConsumido(cal,25)

    //Instâncias Mão de Obra
    var pedreiro = MaoDeObra("Pedreiro",12)
    var engenheiro = MaoDeObra("Engenheiro",15)
    var arquiteto = MaoDeObra("Arquiteto",11)

    var trabalhoPedreiro = MaoDeObraUsada(pedreiro,10 )
    var trabalhoEngenheiro = MaoDeObraUsada(engenheiro, 25)
    var trabalhoArquiteto = MaoDeObraUsada(arquiteto,34 )

    //Atribuição insumos consumidos na obra
    obraContrucao.temInsumo(consumoAreia)
    obraContrucao.temInsumo(consumoCimento)
    obraContrucao.temInsumo(consumoCal)

    //Atribuição trabalhadores usados na obra
    obraContrucao.temTrabalhadores(trabalhoPedreiro)
    obraContrucao.temTrabalhadores(trabalhoEngenheiro)
    obraContrucao.temTrabalhadores(trabalhoArquiteto)

    //Atribuição equipamentos que trabalharam na obra
    obraContrucao.usouEquipamento(trabalhoBetoneira)
    obraContrucao.usouEquipamento(trabalhoTrator)
    obraContrucao.usouEquipamento(trabalhoPa)

    println("Os gastos totais com Insumos são de R$ ${obraContrucao.gastosTotaisComInsumos()}")
    println("Os gastos totais com Mão de Obra são de R$ ${obraContrucao.gastosTotaisComMaoDeObra()}")
    println("Os gastos totais com Equipamentos são de R$ ${obraContrucao.gastosTotaisComEquipamento()}")
    println("Os gastos totais da Obra são de R$ ${obraContrucao.gastosTotaisObra()}")
}