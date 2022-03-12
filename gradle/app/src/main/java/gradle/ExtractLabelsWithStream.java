package gradle;

import java.util.List;

public class ExtractLabelsWithStream implements ExtractLabels {

	@Override
	public List<String> extract(List<Statut> statuts) {
		return statuts.stream().map(Statut::label).toList();
	}
}
