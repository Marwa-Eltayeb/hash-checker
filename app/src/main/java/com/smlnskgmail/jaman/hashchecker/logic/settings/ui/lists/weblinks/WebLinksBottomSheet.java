package com.smlnskgmail.jaman.hashchecker.logic.settings.ui.lists.weblinks;

import com.smlnskgmail.jaman.hashchecker.components.bottomsheets.lists.BaseListBottomSheet;
import com.smlnskgmail.jaman.hashchecker.components.bottomsheets.lists.adapter.BaseListAdapter;

import java.util.List;

abstract class WebLinksBottomSheet extends BaseListBottomSheet {

    @Override
    public BaseListAdapter getItemsAdapter() {
        return new WebLinksListAdapter(
                getLinks(),
                this
        );
    }

    abstract List<WebLink> getLinks();

}
