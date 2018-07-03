package fluentBuilder.classicBuilder.objects;

public class Model {

    private String modelName;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Model{" +
                "modelName='" + modelName + '\'' +
                '}';
    }
}
