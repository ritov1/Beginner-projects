import axios from "axios";

const generateVideo = async (description) => {
  try {
    const response = await axios.post("http://localhost:3000/generate", {
      description,
    });
    return response.data.video_path;
  } catch (error) {
    console.error("Error generating video:", error);
    throw error;
  }
};

export default generateVideo;
