package domain

class Lista {
    private var cabeca : NoLista? = null
    private val valorRemovido : NoLista? = null

    fun add(valor : Double){
        var noLista = NoLista()
        noLista.setValor(valor)
        cabeca?.let { noLista.setProximo(it) }
        cabeca = noLista
    }
    fun remove(): NoLista? {
        if(cabeca == null){
            return null
        }
        cabeca = cabeca!!.getProximo()

        return valorRemovido
    }

    override fun toString(): String {
        var sb = StringBuffer()
        sb.append("[")
        var p : NoLista?
        p = cabeca

        while (p != null){
            sb.append("${p.getValor()} ,")
            p = p.getProximo()
        }
        sb.append("]")
        return sb.toString()
    }


}
