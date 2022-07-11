package JP2.DAO;

import JP2.entity.storeBook;
import java.sql.SQLException;
import java.util.List;

public interface storeBookDao {
    public int insert(storeBook book) throws SQLException;
    public List<storeBook> getAll() throws SQLException;
}
