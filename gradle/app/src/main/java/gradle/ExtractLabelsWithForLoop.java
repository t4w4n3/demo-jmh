package gradle;

import java.util.ArrayList;
import java.util.List;

public class ExtractLabelsWithForLoop implements ExtractLabels {

	@Override
	public List<String> extract(List<Statut> statuts) {
		List<String> list = new ArrayList<>();
		for (Statut statut : statuts) {
			String label = statut.label();
			list.add(label);
		}
		return list;
	}
}
