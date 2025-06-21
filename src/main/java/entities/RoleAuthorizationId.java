package entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RoleAuthorizationId implements Serializable {
    private static final long serialVersionUID = -1759716054966425727L;
    @Column(name = "role_id", nullable = false)
    private int roleId;

    @Column(name = "authorization_id", nullable = false)
    private int authorizationId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getAuthorizationId() {
        return authorizationId;
    }

    public void setAuthorizationId(int authorizationId) {
        this.authorizationId = authorizationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleAuthorizationId entity = (RoleAuthorizationId) o;
        return Objects.equals(this.roleId, entity.roleId) &&
                Objects.equals(this.authorizationId, entity.authorizationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, authorizationId);
    }

}