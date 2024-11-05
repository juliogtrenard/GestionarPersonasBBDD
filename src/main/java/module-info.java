module es.juliogtrenard.gestionarpersonasBBDD {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens es.juliogtrenard.gestionarpersonasBBDD to javafx.fxml;
    exports es.juliogtrenard.gestionarpersonasBBDD;
    exports es.juliogtrenard.gestionarpersonasBBDD.controladores;
    exports es.juliogtrenard.gestionarpersonasBBDD.modelos;
    exports es.juliogtrenard.gestionarpersonasBBDD.dao;
    exports es.juliogtrenard.gestionarpersonasBBDD.db;
    opens es.juliogtrenard.gestionarpersonasBBDD.controladores to javafx.fxml;
    opens es.juliogtrenard.gestionarpersonasBBDD.modelos to javafx.fxml;
}