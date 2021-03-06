package pe.itland.xtreampad.bd.repositorios;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import pe.itland.xtreampad.bd.modelo.Home_Language;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "Home_Language".
*/
public class Home_LanguageDao extends AbstractDao<Home_Language, Long> {

    public static final String TABLENAME = "Home_Language";

    /**
     * Properties of entity Home_Language.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Home_language_id = new Property(0, Long.class, "home_language_id", true, "home_language_id");
        public final static Property Home_principal_id = new Property(1, Long.class, "home_principal_id", false, "home_principal_id");
        public final static Property Name = new Property(2, String.class, "name", false, "name");
        public final static Property Image_path = new Property(3, String.class, "image_path", false, "image_path");
        public final static Property Deleted = new Property(4, boolean.class, "deleted", false, "deleted");
    }


    public Home_LanguageDao(DaoConfig config) {
        super(config);
    }
    
    public Home_LanguageDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"Home_Language\" (" + //
                "\"home_language_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: home_language_id
                "\"home_principal_id\" INTEGER," + // 1: home_principal_id
                "\"name\" TEXT," + // 2: name
                "\"image_path\" TEXT," + // 3: image_path
                "\"deleted\" INTEGER NOT NULL );"); // 4: deleted
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"Home_Language\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Home_Language entity) {
        stmt.clearBindings();
 
        Long home_language_id = entity.getHome_language_id();
        if (home_language_id != null) {
            stmt.bindLong(1, home_language_id);
        }
 
        Long home_principal_id = entity.getHome_principal_id();
        if (home_principal_id != null) {
            stmt.bindLong(2, home_principal_id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String image_path = entity.getImage_path();
        if (image_path != null) {
            stmt.bindString(4, image_path);
        }
        stmt.bindLong(5, entity.getDeleted() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Home_Language entity) {
        stmt.clearBindings();
 
        Long home_language_id = entity.getHome_language_id();
        if (home_language_id != null) {
            stmt.bindLong(1, home_language_id);
        }
 
        Long home_principal_id = entity.getHome_principal_id();
        if (home_principal_id != null) {
            stmt.bindLong(2, home_principal_id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String image_path = entity.getImage_path();
        if (image_path != null) {
            stmt.bindString(4, image_path);
        }
        stmt.bindLong(5, entity.getDeleted() ? 1L: 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Home_Language readEntity(Cursor cursor, int offset) {
        Home_Language entity = new Home_Language( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // home_language_id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // home_principal_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // image_path
            cursor.getShort(offset + 4) != 0 // deleted
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Home_Language entity, int offset) {
        entity.setHome_language_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setHome_principal_id(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setImage_path(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDeleted(cursor.getShort(offset + 4) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Home_Language entity, long rowId) {
        entity.setHome_language_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Home_Language entity) {
        if(entity != null) {
            return entity.getHome_language_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Home_Language entity) {
        return entity.getHome_language_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
