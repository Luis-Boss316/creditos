package mx.saccsa.creditos

class Notarios {
    Integer numeroNotario
    String apellidoPaternoNotarioTitular
    String apellidoMaternoNotarioTitular
    String primerNombreNotarioTitular
    String segundoNombreNotarioTitular
    String apellidoPaternoNotarioSuplente
    String apellidoMaternoNotarioSuplente
    String primerNombreNotarioSuplente
    String segundoNombreNotarioSuplente
    Integer codigoPostalNotario
    String calleDomicilioNotario
    Integer noExteriorNotario
    Integer noInteriorNotario
    String entreCalle
    String yCalle
    Integer claveColonia
    String otraColonia
    Integer tipoAsentamiento
    String referenciaDomicilio
    Integer claveLadaTelefono1
    String telefono1
    Integer extensionTelefono1
    Integer claveLadaTelefono2
    String telefono2
    Integer extensionTelefono2

    static constraints = {
        numeroNotario nullable: false, blank: false
        apellidoPaternoNotarioTitular nullable: false, blank: false
        apellidoMaternoNotarioTitular nullable: true, blank: true
        primerNombreNotarioTitular nullable: false, blank: false
        segundoNombreNotarioTitular nullable: true, blank: true
        apellidoPaternoNotarioSuplente nullable: true, blank: true
        apellidoMaternoNotarioSuplente nullable: true, blank: true
        primerNombreNotarioSuplente nullable: true, blank: true
        segundoNombreNotarioSuplente nullable: true, blank: true
        codigoPostalNotario nullable: false, blank: false
        calleDomicilioNotario nullable: false, blank: false
        noExteriorNotario nullable: false, blank: false
        noInteriorNotario nullable: true, blank: true
        entreCalle nullable: true, blank: true
        yCalle nullable: true, blank: true
        claveColonia nullable: true, blank: true
        otraColonia nullable: true, blank: true
        tipoAsentamiento nullable: true, blank: true
        referenciaDomicilio nullable: true, blank: true
        claveLadaTelefono1 nullable: true, blank: true
        telefono1 nullable: true, blank: true
        extensionTelefono1 nullable: true, blank: true
        claveLadaTelefono2 nullable: true, blank: true
        telefono2 nullable: true, blank: true
        extensionTelefono2 nullable: true, blank: true
    }

    static mapping = {
        table "NOTARIOS"
        version false
        id generator: "identity"
        numeroNotario name:"numeroNotario", column:"numeroNotario", size: 0..3
        apellidoPaternoNotarioTitular name:"apellidoPaternoNotarioTitular", column:"apellidoPaternoNotarioTitular", size: 0..60
        apellidoMaternoNotarioTitular name:"apellidoMaternoNotarioTitular", column:"apellidoMaternoNotarioTitular", size: 0..60
        primerNombreNotarioTitular name:"primerNombreNotarioTitular", column:"primerNombreNotarioTitular", size: 0..60
        segundoNombreNotarioTitular name:"segundoNombreNotarioTitular", column:"segundoNombreNotarioTitular", size: 0..60
        apellidoPaternoNotarioSuplente name:"apellidoPaternoNotarioSuplente", column:"apellidoPaternoNotarioSuplente", size: 0..60
        apellidoMaternoNotarioSuplente name:"apellidoMaternoNotarioSuplente", column:"apellidoMaternoNotarioSuplente", size: 0..60
        primerNombreNotarioSuplente name:"primerNombreNotarioSuplente", column:"primerNombreNotarioSuplente", size: 0..60
        segundoNombreNotarioSuplente name:"segundoNombreNotarioSuplente", column:"segundoNombreNotarioSuplente", size: 0..60
        codigoPostalNotario name:"codigoPostalNotario", column:"codigoPostalNotario", size: 0..5
        calleDomicilioNotario name:"calleDomicilioNotario", column:"calleDomicilioNotario", size: 0..60
        noExteriorNotario name:"noExteriorNotario", column:"noExteriorNotario", size: 0..10
        noInteriorNotario name:"noInteriorNotario", column:"noInteriorNotario", size: 0..6
        entreCalle name:"entreCalle", column:"entreCalle", size: 0..60
        yCalle name:"yCalle", column:"yCalle", size: 0..60
        claveColonia name:"claveColonia", column:"claveColonia", size: 0..10
        otraColonia name:"otraColonia", column:"otraColonia", size: 0..60
        tipoAsentamiento name:"tipoAsentamiento", column:"tipoAsentamiento", size: 0..3
        referenciaDomicilio name:"referenciaDomicilio", column:"referenciaDomicilio", size: 0..120
        claveLadaTelefono1 name:"claveLadaTelefono1", column:"claveLadaTelefono1", size: 0..3
        telefono1 name:"telefono1", column:"telefono1", size: 0..8
        extensionTelefono1 name:"extensionTelefono1", column:"extensionTelefono1", size: 0..5
        claveLadaTelefono2 name:"claveLadaTelefono2", column:"claveLadaTelefono2", size: 0..3
        telefono2 name:"telefono2", column:"telefono2", size: 0..8
        extensionTelefono2 name:"extensionTelefono2", column:"extensionTelefono2", size: 0..5
    }

    static transients = ['descLabel']
    String getDescLabel(){ primerNombreNotarioTitular }
}
