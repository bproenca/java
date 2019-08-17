package br.com.bcp.pattern.mediator;

/**
 * If you have a complex GUI, whenever a button has been clicked, the related
 * actions should be disabled or enabled. You may design a Mediator class to
 * include all related classes:
 * 
 * @author $author
 * @version $revision
 * @create $date
 */
class Mediator {
	BtnView btnView;
	BtnSearch btnSearch;
	BtnBook btnBook;
	LblDisplay show;

	void book() {
		btnBook.setEnabled(false);
		btnView.setEnabled(true);
		btnSearch.setEnabled(true);
		show.setText("booking...");
	}

	void registerBook(final BtnBook b) {
		btnBook = b;
	}

	void registerDisplay(final LblDisplay d) {
		show = d;
	}

	void registerSearch(final BtnSearch s) {
		btnSearch = s;
	}

	// ....
	void registerView(final BtnView v) {
		btnView = v;
	}

	void search() {
		btnSearch.setEnabled(false);
		btnView.setEnabled(true);
		btnBook.setEnabled(true);
		show.setText("searching...");
	}

	void view() {
		btnView.setEnabled(false);
		btnSearch.setEnabled(true);
		btnBook.setEnabled(true);
		show.setText("viewing...");
	}
}
