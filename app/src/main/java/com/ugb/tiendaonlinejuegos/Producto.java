package com.ugb.tiendaonlinejuegos;

public class Producto {
    String _id;
    String _rev;
    String idProducto;
    String codigo;
    String descripcion;
    String marca;
    String presentacion;
    String precio;
    String urlFotoProducto;

    public Producto(String _id, String _rev, String idProducto, String codigo, String descripcion, String marca, String presentacion, String urlFoto) {
        this._id = _id;
        this._rev = _rev;
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.presentacion = presentacion;
        this.precio = String.valueOf(precio);
        this.urlFotoProducto = urlFoto;
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    public String get_rev() {
        return _rev;
    }
    public void set_rev(String _rev) {
        this._rev = _rev;
    }

    public String getUrlFotoProducto() {
        return urlFotoProducto;
    }

    public void setUrlFotoProducto(String urlFotoProducto) {
        this.urlFotoProducto = urlFotoProducto;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPresentacion() {
        return presentacion;
    }
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;}
}