module com.tauynd {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires jakarta.validation;

    opens com.tauynd to javafx.base, javafx.fxml, org.hibernate.orm.core;   
    opens com.tauynd.model to javafx.base, javafx.fxml, org.hibernate.orm.core;   

    exports com.tauynd;
    exports com.tauynd.model;
}
