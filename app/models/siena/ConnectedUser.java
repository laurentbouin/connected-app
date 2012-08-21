package models.siena;

import siena.Generator;
import siena.Id;
import siena.Model;
import siena.Query;

/**
 * User: lbouin
 * Date: 20/08/12
 * Time: 18:01
 */
public class ConnectedUser extends Model {

    @Id(Generator.AUTO_INCREMENT)
    public Long id;

    public Long userId;

    //OAuth token from foursquare
    public String token;

    public ConnectedUser(Long userId, String token){
        this.userId = userId;
        this.token = token;
    }

    public static Query<ConnectedUser>all(){
        return Model.all(ConnectedUser.class);
    }

    public static ConnectedUser findByUserId(Long userId){
        return all().filter("userId",userId).get();
    }

}
