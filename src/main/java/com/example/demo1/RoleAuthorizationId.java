package com.example.demo1;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RoleAuthorizationId implements Serializable {
    private static final long serialVersionUID = -1759716054966425727L;
    @Column(name = "role_id", nullable = false)
    private Integer roleId;

    @Column(name = "authorization_id", nullable = false)
    private Integer authorizationId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAuthorizationId() {
        return authorizationId;
    }

    public void setAuthorizationId(Integer authorizationId) {
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