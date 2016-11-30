package com.expenses.app.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.StringWriter;

import com.expenses.app.config.Env;
import com.expenses.app.dao.SqlExecutor;

public class Schema {

    private final String SCHEMA_PATH = Env.DB_PATH + File.separator
            + "schema.sql";
    private final String TABLES = Env.DB_PATH + File.separator + "tables.txt";

    public void load() throws Exception {
        SqlExecutor executor = new SqlExecutor();
        executor.execute(readSql());
    }

    public String readSql() throws Exception {
        File f = new File(SCHEMA_PATH);
        try {
            FileInputStream in = new FileInputStream(f);

            StringWriter writer = new StringWriter();
            for (int c = in.read(); c != -1; c = in.read()) {
                writer.write(c);
            }
            in.close();
            return writer.toString();
        } catch (FileNotFoundException fileExp) {
            System.out.println("File not found >>> " + f.getAbsolutePath());
            fileExp.printStackTrace();
        }
        return null;
    }

    public void flushAllTables() {
        // To remove all the tables from db
    }

    public static void main(String[] args) throws Exception {
        new Schema().load();
    }
}
