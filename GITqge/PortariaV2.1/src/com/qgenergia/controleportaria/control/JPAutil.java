package com.qgenergia.controleportaria.control;

import com.qgenergia.controleportaria.model.Portaria;
import java.util.List;

public interface JPAutil {

    public void salvar(Portaria p);

    public List<Portaria> getAll();

}
