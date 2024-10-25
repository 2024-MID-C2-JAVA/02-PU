package com.sofka.cuentaBancaria.config;

import java.sql.Connection;
import java.sql.SQLException;

public interface DatabaseConnection {
        Connection getConnection() throws SQLException;
        void close() throws SQLException;
}
