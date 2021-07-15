package mx.saccsa.creditos

class TipoInversionistas {
    static auditable =  true
    String	cveTipoInversionista
    String	descripcion
    Integer	prioridad
    Boolean	institucional
    String	sector
    String	cambioTasa
    Boolean	pJuridica

    static constraints = {
        cveTipoInversionista nullable: true, size: 0..2
        descripcion	nullable: true, size: 0..30
        prioridad	nullable: true
        institucional	nullable: true
        sector	nullable: true, size: 0..6
        cambioTasa	nullable: true, size: 0..1
        pJuridica	nullable: true
    }

    static mapping = {
        table "TIPOINVERSIONISTAS"
        version false
        id column: 'cveTipoInversionista', name:'cveTipoInversionista', generator:'assigned'
        cveTipoInversionista	name: 'cveTipoInversionista', column: 'cveTipoInversionista'
        descripcion name:"descripcion", column:"descripcion"
        prioridad name:"prioridad", column:"prioridad"
        institucional name:"institucional", column:"institucional"
        sector name:"sector", column:"sector"
        cambioTasa name:"cambioTasa", column:"cambioTasa"
        pJuridica name:"pJuridica", column:"pJuridica"
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }

    String getId(){
        cveTipoInversionista
    }
}
